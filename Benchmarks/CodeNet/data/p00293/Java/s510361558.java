import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String meshi = sc.nextLine();
        String tsuru = sc.nextLine();

        int N = Integer.parseInt(meshi.split(" ")[0]);
        int M = Integer.parseInt(tsuru.split(" ")[0]);

        List<String> times = new ArrayList<String>();
        for(int i = 1; i < N*2; i+=2){
            String hour = meshi.split(" ")[i];
            if(Integer.parseInt(hour) < 10){
                hour = "0" + hour;
            }
            String minute = meshi.split(" ")[i+1];
            if(Integer.parseInt(minute) < 10){
                minute = "0" + minute;
            }
            times.add(hour + ":" + minute);
        }

        for(int i = 1; i < M*2; i+=2){
            String hour = tsuru.split(" ")[i];
            if(Integer.parseInt(hour) < 10){
                hour = "0" + hour;
            }
            String minute = tsuru.split(" ")[i+1];
            if(Integer.parseInt(minute) < 10){
                minute = "0" + minute;
            }
            times.add(hour + ":" + minute);
        }

        for(int i = 0; i < times.size()-1; i++){
            for(int j = i+1; j < times.size(); j++){
                if(times.get(j).compareTo(times.get(i)) < 0){
                    String tmp = times.get(j);
                    times.set(j, times.get(i));
                    times.set(i, tmp);
                }
            }
        }

        List<String> unique = new ArrayList<String>();
        for(int i = 0; i < times.size(); i++){
            int hour = Integer.parseInt(times.get(i).split(":")[0]);
            String minute = times.get(i).split(":")[1];
            if(hour < 10){
                times.set(i, hour + ":" + minute);
            }
            if(!unique.contains(times.get(i))){
                unique.add(times.get(i));
            }
        }

        for(int i = 0; i < unique.size()-1; i++){
            System.out.print(unique.get(i) + " ");
        }
        System.out.print(unique.get(unique.size()-1));
    }
}