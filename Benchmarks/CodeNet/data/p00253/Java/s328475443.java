import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
    	    if(n==0){
    		    break;
    	    }
    	    int a[]=new int[n+1];
    	    for(int i=0;i<=n;i++){
                a[i]=sc.nextInt();
            }
            if(n==4){
                if(a[3]-a[2]==a[2]-a[1]&&a[2]-a[1]==a[1]-a[0]){
                    System.out.println(a[4]);
                }else if(a[4]-a[2]==a[2]-a[1]&&a[2]-a[1]==a[1]-a[0]){
                    System.out.println(a[3]);
                }else if(a[4]-a[3]==a[3]-a[1]&&a[3]-a[1]==a[1]-a[0]){
                    System.out.println(a[2]);
                }else if(a[4]-a[3]==a[3]-a[2]&&a[3]-a[2]==a[2]-a[0]){
                    System.out.println(a[1]);
                }else{
                    System.out.println(a[0]);
                }
            }else if(n>4){
                int sub=0;
                int b[]=new int[5];
                for(int i=0;i<5;i++){
                    b[i]=a[i+1]-a[i];
                }
                Arrays.sort(b);
                sub=b[2];
                for(int i=0;i<n;i++){
                    if(a[i+1]-a[i]!=sub){
                        if(i==n-1){
                            System.out.println(a[i+1]);
                            break;
                        }else if(a[i+2]-a[i+1]!=sub){
                            System.out.println(a[i+1]);
                            break;
                        }else{
                            System.out.println(a[i]);
                            break;
                        }
                    }
                }
            }
        }
    }
}
