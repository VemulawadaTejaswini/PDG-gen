import java.util.Scanner;


public class Main {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int [] tower = new int[999];
    tower[0]=1;
    for (int i=0;i<998;i++){
        
        tower[i+1]=tower[i]+i+2;
    }
    
    for (int i=0;i<998;i++){
        if(tower[i]-a>0 && tower[i+1]-b>0 && tower[i]-a == tower[i+1]-b){
            System.out.println(tower[i]-a);
            break;
        }
    }
    
  }
}