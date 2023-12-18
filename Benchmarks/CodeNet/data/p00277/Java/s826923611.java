00.05 sec    18484 KB    122 lines     1798 bytes    2014-10-17 22:00
?
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
import java.util.*;
 
class MyComp implements Comparator<Pair> {
 
    public int compare(Pair arg0, Pair arg1) {
        Pair t0 = (Pair) arg0;
        Pair t1 = (Pair) arg1;
        if(t0.time > t1.time) {
            return -1;
             
        }
        else if(t0.time < t1.time) {
            return 1;
        }
        else {
            if(t0.id > t1.id) {
                return 1;
            }
            else if(t0.id < t1.id) {
                return -1;
            }
            else {
                return 0;
            }
        }
         
    }
     
}
 
 
class Pair {
    int id;
    int time;
    public Pair(int d, int t) {
        this.id = d;
        this.time = t;
    }
    public Pair(Pair a) {
        this.id = a.id;
        this.time = a.time;
    }
     
}
 
public class Main {
 
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
         
         
         
        PriorityQueue <Pair> queA = new PriorityQueue <Pair>(11,new MyComp());
         
        PriorityQueue <Pair> queBX = new PriorityQueue <Pair>(11,new MyComp());
         
        int N = stdIn.nextInt();
        int R = stdIn.nextInt();
        int L = stdIn.nextInt();
         
        int[] time = new int[100000];
         
        int lastTime = 0;
        queA.add(new Pair(1,0);
         
        for(int i = 0; i < R; i++) {
             
            int d = stdIn.nextInt();
            int t = stdIn.nextInt();
            int x = stdIn.nextInt();
            time[queA.peek().id-1] += t - lastTime;
            boolean atta = false;
             
            while(!queA.isEmpty()) {
                 
                Pair tmp = queA.poll();
                 
                if(tmp.id == d) {
                    atta = true;
                    tmp.time +=  x;
                    queBX.offer(tmp);
                    break;
                }
                else {
                    queBX.offer(tmp);
                }
            }
             
            if(!atta) {
                queBX.offer(new Pair(d,x));
            }
                 
            while(!queBX.isEmpty()) {
                queA.offer(queBX.poll());
            }
             
 
            lastTime = t;
                 
        }
         
        time[queA.peek().id-1] += L - lastTime;
         
        int timeA = 0;
        int idA = 0;
        for(int i = 0; i < time.length; i++) {
            if(timeA < time[i]) {
                timeA = time[i];
                idA = i;
            }
        }
         
        System.out.println(idA+1);
         
    }
     
 
 
}