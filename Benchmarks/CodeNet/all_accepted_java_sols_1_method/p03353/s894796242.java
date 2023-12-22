import java.util.ArrayList;
        import java.util.HashSet;
        import java.util.PriorityQueue;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int X = sc.nextInt();
        //String s = "atcoderandatcodeer";
        //int X = 5;
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String cur = s.substring(i,j);
                if(ans.size()==0){
                    ans.add(cur);
                    continue;
                }
                int k=0;
                while(k<ans.size()){
                    if((cur.compareTo(ans.get(k))<=0)) break;
                    k++;
                }
                if(k<ans.size()&&(cur.compareTo(ans.get(k))==0)) continue; // the same substring
                if(ans.size()<X) ans.add(k,cur);
                else{
                    if(k<ans.size()){
                        ans.add(k,cur);
                        ans.remove(ans.size()-1);
                    }
                }
                if(ans.size()==X&&ans.get(X-1).compareTo(cur)<=0) break;
                /*while(k<ans.size()){
                    if((cur.compareTo(ans.get(k))<=0)) break;
                    k++;
                }
                if(k<ans.size()&&((cur.compareTo(ans.get(k)))==0)) continue;
                if(k==ans.size()&&k<=X) {
                    ans.add(cur);
                }
                else if(k==ans.size()&&k>X) continue;
                else if(k<ans.size()&&ans.size()<X) ans.add(k,cur);
                else{
                    ans.add(k,cur);
                    ans.remove(ans.size()-1);
                }
                if(ans.size()==X&&ans.get(X-1).compareTo(cur)==0) break;*/
            }
        }

        System.out.println(ans.get(ans.size()-1));
    }
}