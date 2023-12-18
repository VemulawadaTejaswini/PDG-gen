import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Snake s;
		
		for(int i=0;i<n;i++){
			s = new Snake(scan.next());
			System.out.println(s.getType());
		}
	}
}

class Snake{
	String snake;
	
	Snake(String str){
		snake = str;
	}
	
	public String getType(){
		switch(checkHead()){
		case 1:
			return "A";
		case 2:
			return "B";
		default:
			return "NA";
		}
	}
	
	public int checkHead(){
		if(snake.charAt(0) == 62){
			if(snake.charAt(1) == 39){
				return checkBodyA();
			}else if(snake.charAt(1) == 94){
				return checkBodyB();
			}
		}
		return -1;
	}
	
	public int checkBodyA(){
		int count = 0;
		boolean flag = true;
		
		if(snake.charAt(2) == 61){
			count++;
		}else{
			return -1;
		}
		
		for(int i=3;i<snake.length()-1;i++){
			if(flag){
				if(snake.charAt(i) == 61){
					count++;
				}else if(snake.charAt(i) == 35){
					flag = false;
				}else{
					return -1;
				}
			}else{
				if(snake.charAt(i) == 61){
					count--;
				}else{
					return -1;
				}
			}
		}
		
		if(count == 0){
			if(snake.charAt(snake.length()-1) == 126){
				return 1;
			}
		}
		
		return -1;
	}
	
	public int checkBodyB(){
		boolean flag = false;
		
		for(int i=3;i<snake.length();i+=2){
			if(snake.charAt(i-1)==81){
				if(snake.charAt(i) == 61){
					flag = true;
				}else{
					return -1;
				}
			}else if(snake.charAt(i-1) == 126){
				if(snake.charAt(i) == 126){
					if(flag){
						return 2;
					}else{
						return -1;
					}
				}else{
					return -1;
				}
			}else{
				return -1;
			}
		}
		
		return -1;
	}
}