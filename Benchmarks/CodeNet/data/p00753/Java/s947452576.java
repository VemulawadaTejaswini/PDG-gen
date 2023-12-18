import java.util.Scanner;

class Main{
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n=scan.nextInt();
            if(n==0){
                break;
            }
            int count=0;
            for(int i=n+1;i<2*n;i++){
                boolean flag=false;
                int root=(int)Math.sqrt(i);
                for(int j=2;j<i-1;j++){
                    // System.out.println(i+"%"+j);
                    if(i%2==0){
                        flag=true;
                        break;
                    }
                    if(i%j==0){
                        flag=true;
                        break;
                    }
                    if(root*root==i){
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    count++;
                }
            }
            if(n==1){
                count++;
            }
            System.out.println(count);
        }
    }
}
