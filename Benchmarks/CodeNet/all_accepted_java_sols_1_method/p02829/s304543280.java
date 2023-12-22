import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(),b= sc.nextInt();
switch (a) {
	case 1:
   	 if(b==2){
		System.out.println("3");
     }else{
		System.out.println("2");
     }
    break;
	case 2:
   	 if(b==1){
		System.out.println("3");
     }else{
		System.out.println("1");
     }
    break;
    case 3:
   	 if(b==1){
		System.out.println("2");
     }else{
		System.out.println("1");
     }
    break;
	default:
    // 式の値がどのcaseの値とも一致しなかったときの処理
}

	}
}