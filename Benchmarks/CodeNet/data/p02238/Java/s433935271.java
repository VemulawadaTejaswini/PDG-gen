n = int(input())
graph = [[] for _ in range(n)]
for i in range(n):
    in_list = list(map(int, input().split()))
    u = in_list[0]
    graph[u - 1] = in_list[2:]

d = [0 for _ in range(n)]
f = [0 for _ in range(n)]
time = 0

def dfs(now, prev, graph, d, f):
    if d[now] != 0:
        return d, f
    global time
    time += 1
    d[now] = time
    if not graph[now]:
        f[now] = time + 1
        time += 1
        return
    for k in graph[now]:
        if k - 1 == prev or d[k-1] !=0:
            continue
        dfs(k - 1, now, graph, d, f)
    else:
        time += 1
        f[now] = time
    return d, f



for i in range(n):
    d, f = dfs(i, 0, graph, d, f)
    print(i+1, d[i], f[i])

