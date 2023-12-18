import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

import java.util.ArrayList;

class Component {
    int base;
    int index;

    Component(int base, int index){
        this.base = base;
        this.index = index;
    }
}

class Factorization {
    static ArrayList<Component> divisor(int n){
        ArrayList<Component> ans = new ArrayList<Component>();
        int res = n;
        for(int i=2; i*i<=n; i++){
            boolean firstFlag = true;
            while(res % i == 0){
                if(firstFlag){
                    ans.add(new Component(i, 1));
                    firstFlag = false;
                }else{
                    for(int j=0; j<ans.size(); j++){
                        if(ans.get(j).base == i){
                            ans.get(j).index++;
                        }
                    }
                }
                res /= i;
            }
        }
        if(res != 1){
            ans.add(new Component(res, 1));
        }
        return ans;
    }
}

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int ans = 0;
        for(int m=1; m<=n-1; m++){
            ArrayList<Component> set = Factorization.divisor(m);
            int num = 1;
            for(int i=0; i<set.size(); i++){
                num *= (set.get(i).index + 1);
            }
            ans += num;
        }
        System.out.println(ans);
    }
}