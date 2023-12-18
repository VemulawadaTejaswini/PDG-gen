import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tem = sc.nextLine().split(" ");
        
        int H = Integer.parseInt(tem[0]);
        int W = Integer.parseInt(tem[1]);
        int M = Integer.parseInt(tem[2]);
        
        int[] Harray = new int[H];
        int[] Warray = new int[W];
        
        HashSet<String> Set= new HashSet<String>();
        
        String HW;
        for(int i = 0; i < M; ++i) {
            HW = sc.nextLine();
            Set.add(HW);
            tem = HW.split(" ");
            ++Harray[Integer.parseInt(tem[0]) - 1];
            ++Warray[Integer.parseInt(tem[1]) - 1];
        }
        
        int Hmax = 0;
        int HmaxCount = 1;
        for(int i = 0; i < Harray.length; ++i) {
            if(Harray[i] > Hmax) {
                Hmax = Harray[i];
                HmaxCount = 1;
            } else if(Harray[i] == Hmax) {
                ++HmaxCount;
            }
        }
        
        int Wmax = 0;
        int WmaxCount = 1;
        for(int i = 0; i < Warray.length; ++i) {
            if(Warray[i] > Wmax) {
                Wmax = Warray[i];
                WmaxCount = 1;
            } else if(Warray[i] == Wmax) {
                ++WmaxCount;
            }
        }
        
        int posicount = 0;
        int[] HmaxPosi = new int[HmaxCount];
        for(int i = 0; i < Harray.length; ++i) {
            if(Harray[i] == Hmax) {
                HmaxPosi[posicount] = i;
                ++posicount;
            }
        }
            
        posicount = 0;
        int[] WmaxPosi = new int[WmaxCount];
        for(int i = 0; i < Warray.length; ++i) {
            if(Warray[i] == Wmax) {
                WmaxPosi[posicount] = i;
                ++posicount;
            }
        }
        
        int max = Hmax + Wmax - 1;
        Check:
        for(int i = 0; i < HmaxPosi.length; ++i) {
            for(int j = 0; j < WmaxPosi.length; ++j) {
                if(!Set.contains((HmaxPosi[i] + 1) + " " + (WmaxPosi[j] + 1))) {
                    ++max;
                    break Check;
                }
            }
        }
        
        System.out.println(max);
    }
}