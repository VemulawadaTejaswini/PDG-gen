                    import java.util.Scanner;
                     
                    public class Main {
                      public static void main(String args[]){
                     
                        Scanner scan = new Scanner(System.in);
                        int val = scan.nextInt();
                        if(val>99){
                          int a[] = new int[3];
                        for(int i=2;i>=0;i--){
                    		int x=val%10;
                            
                    		a[i]=x;
                    		val=val/10;
                        }
                              if(a[2]==2 ||a[2]==4 || a[2]==5 || a[2]==7 || a[2]==9){
                    			System.out.println("hon");
                              }else if(a[2]==0 ||a[2]==1 || a[2]==6 ||a[2]==8){
                    			System.out.println("pon");
                              }else{
                                System.out.println("bon");
                              }
                        }else if(val>9){
                             int a[] = new int[2];
                           for(int i=1;i>=0;i--){
                    		int x=val%10;
                         
                    		a[i]=x;
                    		val=val/10;
                        }
                              if(a[1]==2 ||a[1]==4 || a[1]==5 || a[1]==7 || a[1]==9){
                    			System.out.println("hon");
                              }else if(a[1]==0 ||a[1]==1 || a[1]==6 ||a[1]==8){
                    			System.out.println("pon");
                              }else{
                                System.out.println("bon");
                              }
                        }else{
                          if(val==2 ||val==4 || val==5 || val==7 || val==9){
                    			System.out.println("hon");
                              }else if(val==0 ||val==1 || val==6 || val==8){
                    			System.out.println("pon");
                              }else{
                                System.out.println("bon");
                              }
                        }
                      }
                    }