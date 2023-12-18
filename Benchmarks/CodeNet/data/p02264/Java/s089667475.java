package javaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 2017/6/30.
 */
public class Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        List<Process> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new Process(scanner.next(),scanner.nextInt()));
        }
        int index = 0,time = 0,end = 0;
        while(true){
            if(list.get(index).getTime()==0){

            } else if(list.get(index).getTime() <= q){
                time += list.get(index).getTime();
                list.get(index).setTime(0);
                end ++;
                System.out.println(list.get(index).getName()+" "+time);
                if(end == n)
                    break;
            }else{
                time += q;
                list.get(index).setTime(list.get(index).getTime()-q);
            }
            index = (index+1)%n;
        }
    }


}
class Process{
    String name;
    int time;
    public Process(String name,int time){
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}