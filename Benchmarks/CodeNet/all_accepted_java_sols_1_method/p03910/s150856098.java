import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                sc.close();
                boolean ebishu = true;
                int sai = 0;
                while(ebishu){
                        sai++;
                        if(sai * (sai - 1) / 2 < n && sai * (sai + 1) / 2 >= n){
                                ebishu = false;
                        }
                }
                int set = 1;
                n -= sai;
                int[] a = new int[sai];
                boolean yono = true;
                for(int i = sai - 1 ; i > 0 && yono ; i--){
                        if(n > i){
                                a[set] = i;
                                n -= i;
                                set++;
                        }else if(n == i){
                                a[set] = i;
                                n = 0;
                                set++;
                                yono = false;
                        }
                }
                System.out.println(sai);
                for(int i = 1 ; i < set ; i++){
                        System.out.println(a[i]);
                }
        }
}
//難しくない？WAな気しかしない、取り敢えず提出するか