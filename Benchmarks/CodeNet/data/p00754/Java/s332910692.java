import java.io.*;

public class Main{
    public static void main(String[] args){
        String line;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int[] parentheses1=new int[100];//0:なし 1:( 2:)
        int[] parentheses2=new int[100];//0:なし 1:[ 2:]

        try{
            while(true){
                line=reader.readLine();
                if(line.equals("."))break;

                for(int i=0;i<parentheses1.length;i++){
                    parentheses1[i]=0;
                }
                for(int i=0;i<parentheses2.length;i++){
                    parentheses2[i]=0;
                }

                //まず、()括弧があるインデックスを取得する。
                //配列parentheses1の対応する要素を変更する。
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i)=='(')parentheses1[i]=1;
                    else if(line.charAt(i)==')')parentheses1[i]=2;
                }
                //次に、[]括弧があるインデックスを取得する。
                //配列parentheses2の対応する要素を変更する。
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i)=='[')parentheses2[i]=1;
                    else if(line.charAt(i)==']')parentheses2[i]=2;
                }

                //バランスが取れているか確認する。
                //まず、左括弧と右括弧が同数でない場合は、バランスが取れていない。
                int count_left=0;
                int count_right=0;
                for(int i=0;i<parentheses1.length;i++){
                    if(parentheses1[i]==1)count_left++;
                    else if(parentheses1[i]==2)count_right++;
                }
                if(count_left!=count_right){
                    System.out.println("no");
                    continue;
                }
                count_left=0;
                count_right=0;
                for(int i=0;i<parentheses2.length;i++){
                    if(parentheses2[i]==1)count_left++;
                    else if(parentheses2[i]==2)count_right++;
                }
                if(count_left!=count_right){
                    System.out.println("no");
                    continue;
                }

                //次に、左括弧'('と右括弧')'が対応しているかを確かめる。
                for(int i=0;i<parentheses1.length;i++){
                    if(parentheses1[i]==1){
                        for(int j=parentheses1.length-1;j>=i;j--){
                            //対応する括弧があるときは、対応する要素を0にする。
                            if(parentheses1[j]==2){
                                parentheses1[i]=0;
                                parentheses1[j]=0;
                                break;
                            }
                        }
                    }
                }
                //同様の操作を'['および']'に対しても行う。
                for(int i=0;i<parentheses2.length;i++){
                    if(parentheses2[i]==1){
                        for(int j=parentheses2.length-1;j>=i;j--){
                            if(parentheses2[j]==2){
                                parentheses2[i]=0;
                                parentheses2[j]=0;
                                break;
                            }
                        }
                    }
                }

                int flag=1;
                //配列に1や2の要素があれば、バランスは取れていないということになる。
                for(int i:parentheses1){
                    if(i==1||i==2){
                        System.out.println("no");
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    System.out.println("yes");
                }

                flag=1;
                for(int i:parentheses2){
                    if(i==1||i==2){
                        System.out.println("no");
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    System.out.println("yes");
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
