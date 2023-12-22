import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\\s");
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int r = sc.nextInt();


    if(W > x && H > y){
	if(x >= r && y >= r){
		System.out.println("Yes");
        }else{
		System.out.println("No");
        }
    }else{
		System.out.println("No");
    }

   
  }

}