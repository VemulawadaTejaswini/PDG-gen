import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for(int x=0;x<loop;x++){
            int countR=0, countG=0, countB=0, count=0, count2=0, p=0, q=0, r=0;
            int[] l = new int[2];
            int[] m = new int[6];
            int[] n = new int[3];
            int[] num = new int[9];
            String[] cor = new String[9];
            for(int i=0;i<9;i++){
                num[i] = sc.nextInt();
            }
            for(int i=0;i<9;i++){
                cor[i] = sc.next();
                if(cor[i].equals("R")) countR++;
                if(cor[i].equals("G")) countG++;
                if(cor[i].equals("B")) countB++;
            }
            if((countR%3)!=0 || (countG%3)!=0 || (countB%3)!=0){
                System.out.println("0");
                continue;
            }
            Arrays.sort(num);
            for(int i=0;i<9;i+=3){
                if(num[i]==num[i+1] && num[i]==num[i+2]) count++;
            }
            if(count==3){
                System.out.println("1");
                continue;
            }
            for(int i=0;i<7;i++){
                if(num[i]==num[i+1] && num[i]==num[i+2]){
                    l[p]=i;
                    p++;
                    i += 2;
                }
            }
            if(p==0){
                if((num[0]+1)==num[1]){
                    if((num[0]+2)==num[2]){
                        count2++;
                        if((num[3])+1==num[4]){
                            if((num[3])+2==num[5]){
                                count2++;
                                if((num[6]+1)==num[7] && (num[6]+2)==num[8]) count2++;
                            }else if(num[3]+2==num[6]){
                                count2++;
                                if((num[5]+1)==num[7] && (num[5]+2)==num[8]) count2++;
                            }
                        }else if((num[3]+1)==num[5]){
                            if((num[3])+2==num[6]){
                                count2++;
                                if((num[4]+1)==num[7] && (num[4]+2)==num[8]) count2++;
                            }
                        }
                    }else if((num[0]+2)==num[3]){
                        count2++;
                        if((num[2])+1==num[4]){
                            if((num[2])+2==num[5]){
                                count2++;
                                if((num[6]+1)==num[7] && (num[6]+2)==num[8]) count2++;
                            }else if(num[2]+2==num[6]){
                                count2++;
                                if((num[5]+1)==num[7] && (num[5]+2)==num[8]) count2++;
                            }
                        }
                    }
                }else if((num[0]+1)==num[2]){
                    if((num[0]+2)==num[3]){
                        count2++;
                        if((num[1])+1==num[4]){
                            if((num[1])+2==num[5]){
                                count2++;
                                if((num[6]+1)==num[7] && (num[6]+2)==num[8]) count2++;
                            }else if(num[1]+2==num[6]){
                                count2++;
                                if((num[5]+1)==num[7] && (num[5]+2)==num[8]) count2++;
                            }
                        }
                    }else if((num[0]+2)==num[4]){
                        count2++;
                        if((num[1])+1==num[3]){
                            if((num[1])+2==num[5]){
                                count2++;
                                if((num[6]+1)==num[7] && (num[6]+2)==num[8]) count2++;
                            }
                        }
                    }
                }
                if(count2==3){
                    System.out.println("1");
                    continue;
                }
            }
            if(p==1){
                for(int i=0;i<9;i++){
                    if(i==l[0] || i==(l[0]+1) || i==(l[0]+2)) continue;
                    m[q] = i;
                    q++;
                }
                if((num[m[0]]+1)==num[m[1]] && (num[m[0]]+2)==num[m[2]]){
                    count2++;
                }
                if((num[m[3]]+1)==num[m[4]] && (num[m[3]]+2)==num[m[5]]){
                    count2++;
                }
                if(count2==2){
                    System.out.println("1");
                    continue;
                }
            }
            if(p==2){
                for(int i=0;i<9;i++){
                    if(i==l[0] || i==(l[0]+1) || i==(l[0]+2) || i==l[1] || i==(l[1]+1) || i==(l[1]+2)) continue;
                    n[r] = i;
                    r++;
                }
                if((num[n[0]]+1)==num[n[1]] && (num[n[0]]+2)==num[n[2]]){
                    System.out.println("1");
                    continue;
                }
            }
            System.out.println("0");
        }
    }
}
