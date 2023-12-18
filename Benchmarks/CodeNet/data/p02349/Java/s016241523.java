import java.util.*;
                public class Main{
                        public static void main(String[] args){ 
                                Scanner sc = new Scanner(System.in); 
                                int n = sc.nextInt(); 
                                int q = sc.nextInt(); 
                                RaddQ rq = new RaddQ(n); 
                                for (int i = 0; i < q; i++) { 
                                        int command = sc.nextInt(); 
                                        if(command == 0){ 
                                                int s = sc.nextInt(); 
                                                int t = sc.nextInt(); 
                                                int x = sc.nextInt(); 
                                                rq.add(0,n,0,s-1,t,x); 
                                        } 
                                        else if (command == 1) { 
                                                int t = sc.nextInt(); 
                                                System.out.println(rq.get(0,n,0,t-1)); 
                                        } 
                                } 
                        } 
                } 
                class RaddQ { 
                        int n, heap[]; 
                        RaddQ(int n){ 
                                this.n = n; 
                                int len = 1; 
                                while(len < n){ 
                                        len*=2; 
                                } 
                                len = 2*len; 
                                heap = new int[len]; 
                        } 
                        void add(int l, int r, int ih, int s, int t, int x){ 
                                if(s>=t){ 
                                        return; 
                                } 
                                if(s==l && t==r){
                                        heap[ih] += x; 
                                        return; 
                                } 
                                int med = (l+r)/2; 
                                add(l, med, ih*2+1, Math.max(s,l), Math.min(t,med), x); 
                                add(med, r, ih*2+2, Math.max(s,med), Math.min(t,r), x); 
                        } 
                        int get(int l, int r, int ih, int t){ 
                                if(r-l == 1){ 
                                        return heap[ih]; 
                                } 
                                int med = (l+r)/2; 
                                if(t<med){
                                        return heap[ih]+get(l, med, ih*2+1, t); 
                                } 
                                else { 
                                        return heap[ih]+get(med, r, ih*2+2, t); 
                                } 
                        } 
                }
