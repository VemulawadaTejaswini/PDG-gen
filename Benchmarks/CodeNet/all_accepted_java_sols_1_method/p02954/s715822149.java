import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] s = stdIn.next().split("");

        ArrayList<String> a = new ArrayList<String>();

        for(int i = 0; i < s.length;i++) {
            if(s[i].equals("R") && s[i+1].equals("L")) {
                a.add("X");
                if(i == s.length-1){
                    break;
                }
                i++;
            }else if(s[i].equals("R")) {
                a.add("R");
            }else {
                a.add("L");
            }
        }

        int n = a.size();

        int ii = 0;
        //int rcount = 0;
        //int lcount = 0;
        ArrayList<Integer> rlength = new ArrayList<Integer>();
        ArrayList<Integer> llength = new ArrayList<Integer>();

        int[] result = new int[s.length];
        int pluscount = 0;
        int iii = 0;
        for(int i = 0;i < n;i++) {
            if(a.get(i).equals("R")) {
                //rcount++;
                rlength.add(i);
                //result[i] = 0;
            }else if(a.get(i).equals("L")) {
                //lcount++;
                llength.add(i);
                //result[i] = 0;
            }else {
                result[i+pluscount] = 1;
                result[i+1+pluscount] = 1;
                for(int j = 0;j < rlength.size();j++) {
                    if((i - rlength.get(j))%2 == 0) {
                        result[i+pluscount]++;
                    }else{
                        result[i+1+pluscount]++;
                    }
                }
                rlength = new ArrayList<Integer>();

                for(int j = 0;j < llength.size();j++) {
                    if((llength.get(j)-iii)%2 == 1) {
                        result[ii]++;
                    }else{
                        result[ii+1]++;
                    }
                }
                llength = new ArrayList<Integer>();
                ii = i+pluscount;
                iii = i;
                pluscount++;
            }
        }

        if(llength.size() != 0) {
            for(int j = 0;j < llength.size();j++) {
                if((llength.get(j)-iii)%2 == 1) {
                    result[ii]++;
                }else{
                    result[ii+1]++;
                }
            }
        }

        for(int i = 0;i < result.length;i++) {
            System.out.println(result[i]);
        }
    }

}