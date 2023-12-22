import java.util.Scanner; 
class Main { 
public static void main(String args[]) { 
int one=0;
int two=0;
int three=0;
Scanner sc = new Scanner(System.in); 
for(int i=0;i<=9;i++){
int n=sc.nextInt();
if(n>one){
three=two;
two=one;
one=n;
}else if (n>two){
three = two;
two = n;
}
else if(n>three){
three = n;
}
}
System.out.println(one);
System.out.println(two);
System.out.println(three);
 } }
