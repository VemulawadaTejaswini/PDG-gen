import java.util.*;

public class Main{
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
            int n = scan.nextInt();//????£????????????°
            int p = scan.nextInt();//????????°
            boolean end_flag = false;
            if(n==0 && p==0) break;
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i] = 0;     
            }
            while(true){
                if(end_flag) break;
                for(int i=0;i<n;i++){
                    if(end_flag) break;
                    //System.out.println(i);
                    if(p==0){
                       p = num[i];
                       num[i] = 0; 
                    }
                    else{
                        p--;
                        //System.out.println(p);
                        num[i]++;
                        if(p==0){
                            for(int j=0;j<n;j++){
                                if(j==i) {}
                                else{
                                    if(num[j] == 0){}
                                    else break;
                                } 
                                if(j==n-1){
                                    System.out.println(i);
                                    end_flag = true;
                                }
                            }
                        }
                    }
                }
		    }
        }
	}

    public static void main(String[] args){
		Main app = new Main();
		app.run();
    }
}