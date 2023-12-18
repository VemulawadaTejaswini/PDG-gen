import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String oldChar,newChar;

        String str = "";
        Scanner sc = new Scanner(System.in);
        ArrayList<DataSet> dataSet = new ArrayList<>();
        while(true) {
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            ArrayList<Conv> convList = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                oldChar = sc.next();
                newChar = sc.next();
                convList.add(new Conv(oldChar, newChar));
            }
            int listNum = sc.nextInt();
            ArrayList<String> strList = new ArrayList<>();
            for (int i = 0; i < listNum; i++) {
                strList.add(sc.next());
            }
            dataSet.add(new DataSet(strList,convList));
        }

        boolean write= false;
        for (DataSet ds:dataSet){
            for(String s : ds.strList){
                for(Conv c:ds.convList){
                    if(s.equals(c.oldChar)){
                        write = true;
                        ds.newStrList.add(c.newChar);
                        break;
                    }
                }
                if(!write){
                    ds.newStrList.add(s);
                }
                write = false;

            }
            System.out.println(ds.str());
        }
    }
}

class Conv{
    String oldChar,newChar;
    Conv(String oldChar,String newChar){
        this.oldChar = oldChar;
        this.newChar = newChar;
    }
}

class DataSet{
    ArrayList<String> strList;
    ArrayList<String> newStrList = new ArrayList<>();
    ArrayList<Conv> convList;
    DataSet(ArrayList<String> strList,ArrayList<Conv> convList){
        this.strList = strList;
        this.convList = convList;
    }
    String str(){
        String str="";
        for(String s:newStrList){
            str+=s;
        }
        return str;
    }
}