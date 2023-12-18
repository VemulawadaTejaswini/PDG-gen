import java.util.*; 
public class Five_Variables{
public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  int a=0,index=0;
  for(int i=0;i<5;i++){
    a=input.nextInt();
    if(a==0){
      index=i+1;
    }
  }
  System.out.print(index);
}
}