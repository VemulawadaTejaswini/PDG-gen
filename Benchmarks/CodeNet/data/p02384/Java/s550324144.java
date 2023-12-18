import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] face = input.split(" ");
        int num  = Integer.parseInt(br.readLine());
        
        Dice dice = new Dice();
        dice.setFace(face);
        for (int i = 0; i < num; i++) {
        	String question = br.readLine();
        	String[] q = question.split(" ");
        	String top = q[0];
        	String front = q[1];
        	
        	for (int j = 0; j < 3; j++) {
        		if (dice.getTop().equals(top)) { 
        			break;
        		}
        		dice.roll("S");
        	}
        	
        	for (int k = 0; k < 3; k++) {
        		if (dice.getTop().equals(top)) {
        			break;
        		}
        		dice.roll("W");
        	}
        	
        	for (int l = 0; l < 3; l++) {
        		if (dice.getFront().equals(front)) {
        			break;
        		}
        		dice.roll("WSE");
        	}
        	System.out.println(dice.getRight());
        }
        
    }
}

class Dice {
    private String top;
    private String front;
    private String right;
    private String left;
    private String back;
    private String bottom;

    private char direction[];

    public void setFace(String[] face) {
        this.top = face[0];
        this.front = face[1];
        this.right = face[2];
        this.left = face[3];
        this.back = face[4];
        this.bottom = face[5];
    }

    public void roll(String directions) {
        this.direction = directions.toCharArray();

        String temp;
        for (int i = 0; i < direction.length; i++) {
            switch(direction[i]) {
                case 'N':
                    temp = this.top;
                    this.top = this.front;
                    this.front = this.bottom;
                    this.bottom = this.back;
                    this.back = temp;
                    break;
                case 'W':
                    temp = this.top;
                    this.top = this.right;
                    this.right = this.bottom;
                    this.bottom = this.left;
                    this.left = temp;
                    break;
                case 'E':
                    temp = this.top;
                    this.top = this.left;
                    this.left = this.bottom;
                    this.bottom = this.right;
                    this.right = temp;
                break;
                case 'S':
                    temp = this.top;
                    this.top = this.back;
                    this.back = this.bottom;
                    this.bottom = this.front;
                    this.front = temp;
                    break;
            }

        }

    }

    public String getTop() {
        return this.top;
    }
    
    public String getFront() {
    	return this.front;
    }
    
    public String getRight() {
    	return this.right;
    }

}

