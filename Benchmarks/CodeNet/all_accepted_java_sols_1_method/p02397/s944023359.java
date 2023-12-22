import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0&&y==0){
				break;
			}else if(x>y){
	        	sb.append(y+" "+x+"\n");
	        }else{
	        	sb.append(x+" "+y+"\n");
	        }
		}
		System.out.print(sb);
	}
}