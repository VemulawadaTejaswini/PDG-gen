import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,x,y,s;
        for(i=1;i<=3000;i++){
        	x=scan.nextInt();
        	y=scan.nextInt();
        	if(x==0 && y==0)break;
        	else if(x<=y){
        		System.out.println(x +" "+ y);
        	}
        	else{
        		System.out.println(y +" "+x);
        	}
        }
    }
}