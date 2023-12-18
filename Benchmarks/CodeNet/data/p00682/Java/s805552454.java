import java.util.Scanner;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int countQues = 1;
    	while (scan.hasNextInt()) {
    		int numVertices = scan.nextInt();
    		if(numVertices == 0) break;
        	Point[] point = new Point[numVertices];
        	int count = 0;

    		point[count] = new Point(scan.nextInt(), scan.nextInt());
    		
    		double area = 0;
        	
        	for(int i = 0; i < numVertices; i++) {
        		if(i == numVertices-1) i = 0;
        		area += (point[i].x - point[i+1].x) * (point[i].y + point[i+1].y);
        		if(i == numVertices-1) {
        			area /= 2;
        			break;
        		}
        	}
        	System.out.println(countQues + " " + area);
        	countQues++;
    	}
    }
}