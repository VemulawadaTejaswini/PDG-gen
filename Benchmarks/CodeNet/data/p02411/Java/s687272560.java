import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);


for(int i=0;;i++){
    int m = sc.nextInt();
int f = sc.nextInt();
int r = sc.nextInt();
int sum = m+f;
    if(m==-1&&f==-1&&r==-1){
        break;
    }else if(m==-1||f==-1){
    System.out.printf("F\n");
}else if(sum<30){
    System.out.printf("F\n");
}else if(sum>=80){
    System.out.printf("A\n");
}else if(65<=sum&&sum<80){
    System.out.printf("B\n");
}else if(50<=sum&&sum<65){
    System.out.printf("C\n");
 } else if(30<=sum&&sum<50){
     if(r>=50){
        System.out.printf("C\n");
     }else{
        System.out.printf("D\n");
     }
    }
}
    sc.close();
}
}
