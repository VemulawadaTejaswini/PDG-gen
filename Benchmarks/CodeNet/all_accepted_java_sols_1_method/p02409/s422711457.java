import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i=0,j,k,l,m,o=0,p=0;
            int a[][];
            int q[][][];
            a = new int[1000][1000];
            q = new int[1000][10][10];
                Scanner n = new Scanner(System.in);
                int c = n.nextInt();
                while(i<c){
                     a[i][0] = n.nextInt();
                     for(j=1;j<4;j++){
                         a[i][j]=n.nextInt();
                     }
                     i++;
                }
                i=0;
                while(i<4){
                    for(m=0;m<c;m++){
                        if(((a[m][0])-1)==i){
                            q[i][(a[m][1]-1)][(a[m][2]-1)]+=a[m][3];
                        }
                    }
                        for(k=0;k<3;k++){
                            for(l=0;l<10;l++){
                                 System.out.print(" " + q[i][k][l]);
                            }
                            System.out.printf("\n");
                        }
                        if(i==3){
                            System.exit(0);
                        }else{
                        System.out.println("####################");
                        }
                     i++;
                }
        }
    }
