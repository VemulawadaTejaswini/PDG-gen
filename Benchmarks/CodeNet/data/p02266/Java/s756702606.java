import java.util.*;
            public class Main {
                public static void main(String[] args) {
                    Scanner stdIn = new Scanner(System.in);
                    String str = stdIn.next(); 
                    int len = str.length();
                    int[] level = new int[len+1];
                    int top = 0;
                    int bottom = 0;
                    int pos = 0;
                    for (int i=0; i<len; i++) {
                        char c = str.charAt(i);
                        level[i] = pos;
                        if (c == '\\') {
                            pos--; 
                        }
                        else if(c == '/') {
                            pos++; 
                        } 
                        top = Math.max(top,pos);
                        bottom = Math.min(bottom,pos); 
                    } 
                    level[len] = pos; 
                    top = Math.max(top,pos); 
                    bottom = Math.min(bottom,pos); 
                    boolean[] water = new boolean[len]; 
                    Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
                    int sum = 0; 
                    for (int i=top; i>bottom; i--) {
                        int start = -1;
                        for (int j=0; j<len; j++) { 
                            if (!water[j]) {
                                if ((start==-1?level[j]:level[j+1]) == i) { 
                                    if (start == -1 && level[j]>level[j+1]) {
                                        start = j;
                                    } 
                                    else if(start != -1){ 
                                        int count = 0;
                                        int vol = 0; 
                                        for (int k=start; k<j+1; k++) { 
                                            vol += Math.abs(level[start] - Math.max(level[k],level[k+1])); 
                                            if(Math.abs(level[k] - level[k+1]) > 0) 
                                                count++; 
                                            water[k] = true;
                                        } 
                                        vol += count/2; 
                                        sum += vol; 
                                        map.put(start,vol); 
                                        start = -1; 
                                    } 
                                } 
                            } 
                        } 
                    } 
                    System.out.println(sum); 
                    System.out.print(map.size()); 
                    for (int i=0; map.size()!=0; i++) { 
                        if(map.containsKey(i)){ 
                            System.out.print(" "+map.get(i)); 
                            map.remove(i); 
                        } 
                    } 
                    System.out.println(); 
                } 
            }
