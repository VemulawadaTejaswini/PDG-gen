import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan =new Scanner(System.in);
                int val[]=new int[3];
                val[0]=scan.nextInt();
                val[1]=scan.nextInt();
                val[2]=scan.nextInt();
                for(int i=0;i<3;i++){
                        for(int j=0;j<2;j++){
                                if(val[j]>val[j+1]){
                                        int temp=val[j];
                                        val[j]=val[j+1];
                                        val[j+1]=temp;
                                }
                        }
                }
                System.out.println(val[0]+" "+val[1]+" "+val[2]);
        }
}