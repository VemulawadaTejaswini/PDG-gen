import java.util.*;


class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        ArrayList<Integer> list5 = new ArrayList<Integer>();
        ArrayList<Integer> listN = new ArrayList<Integer>();
        for(int i =0;i<n;i++){
            int tmp = sc.nextInt();
            if(tmp%2==0){
                list2.add(tmp);
            } else if(tmp%3==0){
                list3.add(tmp);
            } else if(tmp%4==0){
                list4.add(tmp);
            } else if(tmp%5==0){
                list5.add(tmp);
            } else {
                listN.add(tmp);
            }
        }
        Collections.sort(list2);
            Collections.sort(list3);
            Collections.sort(list4);
            Collections.sort(list5);
            Collections.sort(listN);
            int ans = n;
            if(list3.size()!=0){
                for(int i = 1;i<list3.size();i++){
                    for(int j = i-1;j>=0;j++){
                        if(list3.get(i)%list3.get(j)==0){
                            ans --;
                            break;
                        }
                    }
                }
            }
            if(list4.size()!=0){
                for(int i = 1;i<list4.size();i++){
                    for(int j = i-1;j>=0;j++){
                        if(list4.get(i)%list4.get(j)==0){
                            ans --;
                            break;
                        }
                    }
                }
            }
            if(list5.size()!=0){
                for(int i = 1;i<list5.size();i++){
                    for(int j = i-1;j>=0;j++){
                        if(list5.get(i)%list5.get(j)==0){
                            ans --;
                            break;
                        }
                    }
                }
            }
            if(listN.size()!=0){
                for(int i = 1;i<listN.size();i++){
                    for(int j = i-1;j>=0;j++){
                        if(listN.get(i)%listN.get(j)==0){
                            ans --;
                            break;
                        }
                    }
                }
            }
    }
}
