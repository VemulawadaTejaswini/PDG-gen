import java.util.Scanner;

public class Main{
public void main(String[] args){

Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int i =1;

int x=i;
if(x%3==0){
System.out.printf(""+i);

while(true){
if(x%10==3){
System.out.printf("""+i);
break;
}
x/=10;
if(x!=0){
continue;
}else{ break;
}
}
i++;
System.out.println();
}}}
