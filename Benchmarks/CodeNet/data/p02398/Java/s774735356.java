import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

int i;
int ans=0;

int a = sc.nextInt();
int b = sc.nextint();
int c = sc.nextInt();

for(i=a;i<=b;i++){
if(c%i==0){
ans++;
}

System.out.println(ans);

}
}