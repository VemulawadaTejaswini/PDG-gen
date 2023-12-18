import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

for(int i=0;;i++){
int H = sc.nextInt();
int W = sc.nextInt();
if(H==0&&W==0){
    break;
}

for(int m=0;m<H;m++){

    if(m==0||m==H-1){
for(int k=0;k<W;k++){
    System.out.printf("#");
}
    }else{
        for(int k=0;k<W;k++){
        if(k==0||k==W-1){
            System.out.printf("#");
        }else{
            System.out.printf(".");
        }
    }
    }
    System.out.printf("\n");
}
    System.out.printf("\n");

}
    sc.close();
}

}
