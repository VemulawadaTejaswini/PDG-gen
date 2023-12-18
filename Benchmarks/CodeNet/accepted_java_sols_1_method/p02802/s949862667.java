import java.util.Scanner;

 class Main {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int m=in.nextInt();
      int[] AC = new int[n];
      int[] WA = new int[n];
      int acount=0;
      int wcount=0;
      
        for (int i = 0; i < m; i++) {
            int s=in.nextInt();
            String v=in.next();
             if(v.equals("WA") && AC[s-1] == 0){
                WA[s-1]++;
            }
            if(v.equals("AC")){
                AC[s-1] = 1;
            }
        }
        
        for(int i = 0; i < n; i++){
            acount += AC[i];
            if(AC[i] == 1){
                wcount += WA[i];
            }
        }
        System.out.println(acount+" "+wcount);
    }
    
    
}