import java.util.*;

public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  if(360%x==0){
System.out.print(360/x);
  }else{
    int i=1;
while(true){
int y=x*i;
if(y%360==0){
System.out.print(i);
  break;
}
i++;
}

  }
}
}
