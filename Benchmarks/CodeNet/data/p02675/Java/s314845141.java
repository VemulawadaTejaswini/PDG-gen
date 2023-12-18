import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
        int o = i % 10;
      	if(o==2||o==4||o==5||o==7||o==9){
          System.out.println("hon");
        }else if(o==0||o==1||o==6||o==8){
          System.out.println("pon");
    	}else if(o==3){
          System.out.println("bon");
        }
    }
}

