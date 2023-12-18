import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        long k = stdIn.nextLong();
        
        long a[] = new long[n];
        long b[] = new long[m];
        
        for(int i = 0; i < n; i++){
            a[i]  = stdIn.nextLong(); 
        }
        
        for(int i = 0; i < m; i++){
            b[i]  = stdIn.nextLong(); 
        }
        
        int aCount = 0;
        int bCount = 0;
        int totalCount = 0;
        long timeCount = 0;
        
        while(true){
            if(aCount >= n){
                //System.out.println("totalCount");
                if(bCount >= m){
                    break;
                }else{
                    if(timeCount + b[bCount] <= k){
                        timeCount += b[bCount];
                        bCount++;
                        totalCount++;
                    }else{
                        break;
                    }
                }
            }else{
                //System.out.println("a");
                if(bCount >= m){
                    //System.out.println("totalCount");
                    if(timeCount + a[aCount] <= k){
                        timeCount += a[aCount];
                        aCount++;
                        totalCount++;
                    }else{
                        break;
                    }
                }else{
                    //System.out.println("totalCunt");
                    if(a[aCount] > b[bCount]){
                        if(timeCount + b[bCount] <= k){
                            timeCount += b[bCount];
                            bCount++;
                            totalCount++;
                        }else{
                            break;
                        }
                    }else{
                        if(timeCount + a[aCount] <= k){
                            timeCount += a[aCount];
                            aCount++;
                            totalCount++;
                        }else{
                            break;
                        }
                    }
                }
            }
            //System.out.println(totalCount + " " + aCount + " " + bCount + " " + timeCount);
        }
        //String s = stdIn.next();
        //boolean flag = false;
        //int a[] = new int[n];
        
        //for(int i = 0; i < n; i++){
        //    a[i] = stdIn.nextInt();
        //}
        
        //if(flag){
        System.out.println(totalCount);
        //}else{
        //    System.out.println();
        //}
    }
}
