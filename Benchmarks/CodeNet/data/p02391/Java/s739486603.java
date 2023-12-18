import java.util.Scanner;

class Main{

Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();

if(a > b){
   System.out.println("a>b");
}else if(a < b){
   System.out.println("a<b");
}else{
   System.out.println("a==b");
}

sc.close();

}
