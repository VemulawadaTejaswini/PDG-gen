import java.util.*;

/**
 * A GaussJordan object holds a two dimensional array representing a matrix
 * containing a system of equations. Contains methods for performing a
 * Gauss-Jordan Elimination and putting a matrix into Reduced Row Echelon Form
 *
 * @author Thomas Coe
 * @version 1.0 October 8th, 2013
 */
class GaussJordan{

    private double[][] augmentedMatrix;

    /**
     * Constructor for a GaussJordan object. Takes in a two dimensional double
     * array holding the matrix.
     *
     * @param matrix A double[][] containing the augmented matrix
     */
    public GaussJordan(double[][] matrix) {
        augmentedMatrix = matrix;
    }

    /**
     * Runs a Gauss-Jordan elimination on the augmented matrix in order to put
     * it into reduced row echelon form
     *
     */
    public void eliminate() {
        int startColumn = 0;
        for (int row=0; row<augmentedMatrix.length; row++) {
            //if the number in the start column is 0, try to switch with another
            while (augmentedMatrix[row][startColumn]==0.0){
                boolean switched = false;
                int i=row;
                while (!switched && i<augmentedMatrix.length) {
                    if(augmentedMatrix[i][startColumn]!=0.0){
                        double[] temp = augmentedMatrix[i];
                        augmentedMatrix[i]=augmentedMatrix[row];
                        augmentedMatrix[row]=temp;
                        switched = true;
                    }
                    i++;
                }
                //if after trying to switch, it is still 0, increase column
                if (augmentedMatrix[row][startColumn]==0.0) {
                    startColumn++;
                }
            }
            //if the number isn't one, reduce to one
            if(augmentedMatrix[row][startColumn]!=1.0) {
                double divisor = augmentedMatrix[row][startColumn];
                for (int i=startColumn; i<augmentedMatrix[row].length; i++) {
                    augmentedMatrix[row][i] = augmentedMatrix[row][i]/divisor;
                }
            }
            //make sure the number in the start column of all other rows is 0
            for (int i=0; i<augmentedMatrix.length; i++) {
                if (i!=row && augmentedMatrix[i][startColumn]!=0) {
                    double multiple = 0-augmentedMatrix[i][startColumn];
                    for (int j=startColumn; j<augmentedMatrix[row].length; j++){
                        augmentedMatrix[i][j] +=
                                multiple*augmentedMatrix[row][j];
                    }
                }
            }
            startColumn++;
        }
    }

    /**
     * Returns a String with the contents of the augmented matrix.
     *
     * @return A String representation of the augmented matrix
     */
    public String toString() {
        String text = "";
        for (int i=0; i<augmentedMatrix.length; i++) {
            for (int j=0; j<augmentedMatrix[i].length; j++) {
                text+=augmentedMatrix[i][j] + ", ";
            }
            text+="\n";
        }
        return text;
    }
}

class Point implements Comparable{
    public double x;
    public double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;
        if (this.x != p.x) return (int)(this.x - p.x);
        return (int)(p.y - this.y);
    }
}


class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Point> points = new ArrayList<Point>();
            for (int j = 0; j < 3; j++) {
                double x = in.nextDouble();
                double y = in.nextDouble();
                points.add(new Point(x,y));
            }
            solve(points);
        }
    }

    public static double calcXY(double x1, double x2) {
	    return x1 + (x2 - x1) / 2.0;
    }

    public static double calcAdash(double x1, double x2, double y1, double y2) {
	    return -1.0 * (x2 - x1) / (y2 - y1);
    }

    public static double calcB(double y, double adash, double x) {
	    return y - adash * x;
    }

    static double EPS = 1e-6;
    public static boolean EQ(double d1, double d2) {
        return (Math.abs(d1 - d2) < EPS);
    }

    public static List<Double> genRow(double x1, double x2, double y1, double y2) {
        double x = calcXY(x1, x2);
        double y = calcXY(y1, y2);
        List<Double> row = new ArrayList<>();
        if(EQ(y2, y1)) {
            row.add(0.0);
            row.add(1.0);
            row.add(x);
        } else if(EQ(x2, x1)) {
            row.add(1.0);
            row.add(0.0);
            row.add(y);
        } else {
            double adash = calcAdash(x1, x2, y1, y2);
            row.add(1.0);
            row.add(-adash);
            row.add(calcB(y, adash, x));
        }
        // ????????????
        row.add(0.0);
        row.add(0.0);

        return row;
    }

    public static void solve(ArrayList<Point> p) {
	    double x1 = p.get(0).x;
	    double y1 = p.get(0).y;
	    double x2 = p.get(1).x;
	    double y2 = p.get(1).y;
	    double x3 = p.get(2).x;
	    double y3 = p.get(2).y;

	    List<List<Double>> A = new ArrayList<List<Double>>();
	    A.add(genRow(x1, x2, y1, y2));
	    A.add(genRow(x1, x3, y1, y3));

        double[][] arrays = {
                {A.get(0).get(0), A.get(0).get(1), A.get(0).get(2)},
                {A.get(1).get(0), A.get(1).get(1), A.get(1).get(2)}
        };
        GaussJordan g = new GaussJordan(arrays);
        g.eliminate();

        double px = arrays[0][2];
        double py = arrays[1][2];
        double R = Math.sqrt(Math.pow(px-x1, 2.0) + Math.pow(py-y1, 2.0));
        System.out.println(String.format("%.3f %.3f %.3f", px, py, R));
	}
}