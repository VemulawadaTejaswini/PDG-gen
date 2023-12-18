import java.util.Scanner;

class Main{
  public static void main(String args[]){
      int a=1,b=1;
      while(a!=0||b!=0){
    Scanner sc = new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
int i=0,j=0,k=1;

if(a==0&&b==0){
    System.exit(0);
}else{
 for(i=0;i<a;i++){
     k++;
    for(j=0;j<b;j++){
        if((j+k)%2==0){
            System.out.print("#");
        }else System.out.print(".");
    }
    System.out.println("");
 }
    }
    System.out.println("");
}

}
}

