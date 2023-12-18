import java.util.*;
class Main{
    public static void main (String [] args){
	Scanner sc = new Scanner (System.in);
	int count = sc.nextInt();
	while (count > 0) {
	    Square square = new Square();
	    for(int i = 0; i < count - 1; i++){
		square.setSquare(sc.nextInt(),sc.nextInt());
	    }
	    System.out.println(square.width() + " " + square.height());
	    count = sc.nextInt();	
	} 
    }
}

class Square{
    int[][] square;
    int squareNumber;
    public static final int left = 0;
    public static final int down = 1;
    public static final int right = 2;
    public static final int up = 3;
    
    Square(){
        square = new int[400][400];
	for(int i = 0;i<square.length;i++){
	    for(int j = 0 ; j < square[i].length ; j ++){
		square[i][j] = -1;	 
	    }
	} 
	square[square.length/2][square[0].length/2] = 0; 
	squareNumber = 1;
    }
    void setSquare(int number, int direction){
	for(int i = 0; i < square.length ;i++){
	    for(int j = 0 ; j <square[i].length ; j++ ){
		if(square[i][j] == number){
		    switch (direction) {
		    case left:
			square[i-1][j] = squareNumber;
			break;
		    case down:
			square[i][j-1] = squareNumber;
			break;
		    case right:
			square[i+1][j] = squareNumber;
			break;
		    case up:
			square[i][j+1] = squareNumber;
			break;		    
		    }
		    squareNumber++;
		    return;
		}
	    }
	}
    }

int heightMin(){
for(int j = 0 ; j < square[0].length; j++) {
	for(int i = 0 ; i < square[0].length ; i++) {
		if(square[i][j] >= 0) {
			return j;
		}
	}
}
return 0;
}
int heightMax(){
for(int j = square[0].length-1 ; j >= 0 ; j--) {
	for(int i = square.length-1 ; i >= 0 ; i--) {
		if(square[i][j] >= 0){
			return j;
		}
	}
}
return 0;
}
    int height(){
	return heightMax() - heightMin() +1;
    }

    int widthMin(){
    	for(int i = 0; i < square.length ; i++){
    		for(int j = 0 ; j < square[i].length ; j++){
    			if(square[i][j] >= 0){
    				return i;
    			}
    		}
    	}
    	return 0;
    }

    int widthMax(){
    for(int i = square.length-1; i >=0 ; i--){
    		for(int j = square[i].length-1 ; j >= 0 ; j--){
    			if(square[i][j] >= 0){
    				return i;
    			}
    		}
    	}
    	return 0;	
    }
    int width(){
	return widthMax() - widthMin() + 1;
    }
}