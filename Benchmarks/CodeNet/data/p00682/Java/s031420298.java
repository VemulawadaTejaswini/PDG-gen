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

        	for(int i = 0; i < numVertices; i++) {
        		point[i] = new Point(scan.nextInt(), scan.nextInt());
        	}
    		
    		double area = 0;
        	
        	for(int i = 0; i < numVertices; i++) {
        		if(i == numVertices-1) {
        			int tmp_area = (point[i].x*point[0].y - point[0].x*point[i].y);
            		//if (tmp_area < 0) tmp_area *= -1;
            		area += tmp_area;
        			area /= 2;
        			if(area <0) area *= -1;
        			break;
        		}
        		int tmp_area = (point[i].x*point[i+1].y - point[i+1].x*point[i].y);
        		//if (tmp_area < 0) tmp_area *= -1;
        		area += tmp_area;
        	}
        	System.out.println(countQues + " " + area);
        	countQues++;
    	}
    }
}