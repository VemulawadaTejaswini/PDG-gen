import java.io.*;
import java.util.*;
class Program{
    
}
class Main{
    public static void main(String[] args) {
        Program obj = new Program();
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        ArrayList<String> S = new ArrayList<String>();
        for(int i=0;i<N;i++) S.add(in.nextLine());
        boolean flag = true;
        for(int i = 0;i<S.size()-1;i++){
            if (S.get(i).charAt( S.get(i).length()-1 ) != S.get(i+1).charAt(0) ){
                flag = false; break;
            }
        }
        //System.out.println(new HashSet<String>(S).size());
        if (flag==true && new HashSet<String>(S).size()==N) System.out.println("Yes");
        else System.out.println("No");    
    }
}