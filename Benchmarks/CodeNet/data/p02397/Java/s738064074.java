import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,x,y;
		Scanner sc = new Scanner(System.in);
		for(i=1;;i++){
			x=sc.nextInt();
			x=sc.nextInt();
			if(x==0&&y==0){
			    sc.clode();
			    break;
			}
			if(x<y){
			    System.out.println(x+' '+y);
			}
			else{
			    System.out.println(y+' '+x);
			}
		}
		sc.close();
	}

}

