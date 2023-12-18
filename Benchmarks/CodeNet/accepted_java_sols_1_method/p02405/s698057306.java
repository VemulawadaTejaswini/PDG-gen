import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

for(int j=0;;j++){
int h = sc.nextInt();
int w = sc.nextInt();

if(h==0&&w==0){
    break;
}

for(int i=0;i<h;i++){
    for(int k=0;k<w;k++){
        if(i%2==0){
            if(k%2==0){
                System.out.printf("#");
            }else{
                System.out. printf(".");
            }
        }else{
            if(k%2==0){
                System.out. printf(".");
            }else{
                System.out. printf("#");
            }

        }
    }
    System.out. printf("\n");
}
System.out. printf("\n");

}

sc.close();

}

}
