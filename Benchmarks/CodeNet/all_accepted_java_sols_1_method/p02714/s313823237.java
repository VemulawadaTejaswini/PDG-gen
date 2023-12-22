import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        
        int[] r = new int[n];
        int[] g = new int[n];
        int[] b = new int[n];
        for(int i = n-1; i >= 0; i--){
            if(i != n-1){
                r[i] = r[i+1];
                g[i] = g[i+1];
                b[i] = b[i+1];
            }
            switch(s.charAt(i)){
                case 'R':
                    r[i]++;
                    break;
                case 'G':
                    g[i]++;
                    break;
                case 'B':
                    b[i]++;
                    break;
            }
        }
        
        long ans = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                int k = j + (j-i);
                if(s.charAt(i) == 'R'){
                    if(s.charAt(j) == 'G'){
                        ans += b[j+1];
                        if(k < n && s.charAt(k) == 'B'){
                            ans--;
                        }
                    }else if(s.charAt(j) == 'B'){
                        ans += g[j+1];
                        if(k < n && s.charAt(k) == 'G'){
                            ans--;
                        }
                    }
                }else if(s.charAt(i) == 'G'){
                    if(s.charAt(j) == 'R'){
                        ans += b[j+1];
                        if(k < n && s.charAt(k) == 'B'){
                            ans--;
                        }
                    }else if(s.charAt(j) == 'B'){
                        ans += r[j+1];
                        if(k < n && s.charAt(k) == 'R'){
                            ans--;
                        }
                    }
                }else{
                    if(s.charAt(j) == 'R'){
                        ans += g[j+1];
                        if(k < n && s.charAt(k) == 'G'){
                            ans--;
                        }
                    }else if(s.charAt(j) == 'G'){
                        ans += r[j+1];
                        if(k < n && s.charAt(k) == 'R'){
                            ans--;
                        }
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}