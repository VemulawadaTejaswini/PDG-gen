import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, space, work;
        boolean judge;
        char[] s = sc.next().toCharArray();
        for(int i=0; i<n; i++){
            char[] s2 = sc.next().toCharArray();
            judge = false;
            for(int j=0; j<s2.length; j++){
                if(s[0]==s2[j]){              
                    for(int k=j+1; k<s2.length; k++){
                        if(s[1]==s2[k]){                          
                            space = k-j;
                            if(s2.length<=space*(s.length-1)+j) break;
                            work = k;                           
                            for(int l=2; l<s.length; l++){
                                work+=space;
                                if(s2[work]!=s[l]) break;
                                if(l==s.length-1){
                                    count++;
                                    judge = true;
                                }
                            }
                            if(judge==true) break;
                        }
                    }
                }
                if(judge==true) break;
            }
        }         
        System.out.println(count);
    }
 
}
 