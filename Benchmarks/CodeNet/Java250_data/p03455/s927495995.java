import java.util.Scanner;

class Main{
public static void main(String argv[]){
    Scanner sc = new Scanner(System.in);
    boolean flag = false;
    for(int i=0;i<2;i++){
        int x = sc.nextInt();
        if((x%2)==0){flag = true;}
    }
    sc.close();
    if(flag==true){System.out.println("Even");}
    else{System.out.println("Odd");}
}
}