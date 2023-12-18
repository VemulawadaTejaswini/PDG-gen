import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.next();
            if(str.equals("-")){
                break;
            }
            int num = str.length(),m = sc.nextInt(),h;
            String ar[] =str.split(""),ex[]=new String[num];
            for(int i=0;i<m;i++){
                h=sc.nextInt();
                for(int j=0;j<h;j++){
                    ex[j]=ar[j];
                }
                for(int l=h;l<num;l++){
                    ar[l-h]=ar[l];
                }
                for(int k=0;k<h;k++){
                    ar[k+(num-h)]=ex[k];
                }
            }
            for(int r=0;r<num;r++){
                System.out.print(ar[r]);
            }
            System.out.print("\n");
        }

        sc.close();
    }
}

