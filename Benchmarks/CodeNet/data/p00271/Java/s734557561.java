import java.util.Scanner;
public class Main{
    int hight;
    int low;
    int sa;
    
    public void soleve(){
       Scanner sc = new Scanner(System.in);
	   for(int i=1;i<8;i++){
        hight = sc.nextInt();
        low = sc.nextInt();
		sa = hight-low;
        System.out.println(sa);
	   }
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.soleve();
    }
}