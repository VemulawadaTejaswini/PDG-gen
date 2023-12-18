import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n,m;
        
        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            
            if((n==0)&&(m==0))break;
            int[] Taro = new int[n];
            int[] Hanako = new int[m];
            int TotalTaro = 0;
            int TotalHanako = 0;
            int DasuTaro=101;
            int DasuHanako=101;
            
            for(int i=0; i<n; i++){
                Taro[i] = sc.nextInt();
                TotalTaro += Taro[i];
            }
            for(int i=0; i<m; i++){
                Hanako[i] = sc.nextInt();
                TotalHanako += Hanako[i];
            }
            
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    if((TotalTaro-Taro[i]+Hanako[j])==(TotalHanako-Hanako[j]+Taro[i])){
                        if((DasuTaro+DasuHanako)>(Taro[i]+Hanako[j])){
                            DasuTaro=Taro[i];
                            DasuHanako=Hanako[j];
                        }
                    }
                }
            }
            if((DasuTaro==101)&&(DasuHanako==101))
                System.out.println(-1);
            else{
                System.out.println(DasuTaro + " " + DasuHanako);
            }
    
        }
    }
}