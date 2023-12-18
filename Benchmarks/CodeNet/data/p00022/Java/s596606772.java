public class Main{
    public static void main(String [] args){
         Main m = new Main();
         m.run();
    }
    
    void run(){
         Scanner sc = new Scanner(System.in);

         for(;;){
             int n = sc.nextInt();
             if(n == 0) break;

             int[] seq = new int[n];
             for(int i = 0; i < n ;i++){
                 seq[i] = sc.nextInt();
             } 

             long ans = solve(seq);   
         }
    }

    long solve(int[] seq){
        int n = seq.length;
        long ans = -Long.MAX;
        for(int start = 0; start < n; start++){
            for(int end = start; end < n ; end++){
                long sum = 0;
                for(int index = start; index <= end; index++){
                    sum += seq[index];
                }
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}