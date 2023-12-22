import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i=0,j,k,count=0;
            int a[];
            int b[];
            int c[];
            a = new int[100000];
            b = new int[100000];
            c = new int[100000];
                Scanner n = new Scanner(System.in);
                while(true){
                     a[i] = n.nextInt();
                     b[i] = n.nextInt();
                     c[i] = n.nextInt();
                     if(a[i]==-1 && b[i]==-1 && c[i]==-1){
                         break;
                     }
                     count++;
                     i++;
                }
                i=0;
                while(count>i){
                    int d = a[i]+b[i];
                        if(a[i]==-1 || b[i]==-1){
                            System.out.printf("F");
                        }else if(d>=80){
                            System.out.printf("A");
                        }else if(d>=65 && d<80){
                            System.out.printf("B");
                        }else if(d>=50 && d<65){
                            System.out.printf("C");
                        }else if(d>=30 && d<50){
                            if(c[i]>=50){
                                System.out.printf("C");
                            }else{
                            System.out.printf("D");
                            }
                        }else if(d<30){
                            System.out.printf("F");
                        }
                     i++;
                     System.out.printf("\n");
                }
        }
    }
