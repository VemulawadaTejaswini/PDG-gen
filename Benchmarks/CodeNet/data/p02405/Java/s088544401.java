import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      int i,j,k,x,y;
      Scanner sc =new Scanner(System.in);
      for(i=0; ;i++){
          x=sc.nextInt();
          y=sc.nextInt();
          if((x==0)&&(y==0)){
              break;
          }else{
              for(j=1;j<=x;j++){
                for(k=1;k<=y;k++){
                    if((j+k)%2==0){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.print("\n");
              }
          }
        }
        System.out.print("\n");
    }
}
