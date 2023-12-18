import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] n = new int[9];
            char[] list = sc.nextLine().toCharArray();
            for (int i : list) {
                n[i - '1']++;
            }
            List<Integer> result=new ArrayList<>();
            
            for (int i = 0; i < 9; i++) {
                if (n[i] < 4) {
                    int[] temp = n.clone();
                    temp[i]++;

                    out:
                    for (int j = 0; j < 9; j++) {
                        if (temp[j] >= 2) {
                            int[] temp2=temp.clone();
                            temp2[j] -= 2;
                            for (int k = 0; k < 7; k++) {
                                if ((temp2[k] == 1 || temp2[k] == 4) && temp2[k+1]>0&&temp2[k+2]>0) {
                                    temp2[k]--;temp2[k+1]--;temp2[k+2]--;
                                }
                                if (temp2[k] == 2 && temp2[k+1]>=2&&temp2[k+2]>=2) {
                                    temp2[k]-=2;temp2[k+1]-=2;temp2[k+2]-=2;
                                }
                                if(temp2[k]==3) {
                                    temp2[k]-=3;
                                }
                            }
                            boolean f=true;
                            for(int k:temp2) {
                                if(k%3!=0) {
                                    f=false;
                                }
                            }
                            if(f) {
                                result.add(i+1);
                                break out;
                            }
                        }
                    }

                }
            }
            if(result.isEmpty()) {
                System.out.println(0);
            }else {
                for(int i=0;i<result.size()-1;i++) {
                    System.out.print(result.get(i)+" ");
                }
                System.out.println(result.get(result.size()-1));
            }
        }
    }
    static void p(int[] temp) {
        for(int l=0;l<9;l++) {
            System.out.print(temp[l]+" ");
        }
        System.out.println();
    }
}
