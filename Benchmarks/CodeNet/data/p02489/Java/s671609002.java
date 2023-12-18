import java.util.Scanner;

public class Main{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

for(int i=1; ; i++){
int x =sc.nextInt();
if(x==0){
break;
}
for(int j=1; j==i ;j++){
System.out.printf("Case %d: %d\n",j,x);
}
}
}
}